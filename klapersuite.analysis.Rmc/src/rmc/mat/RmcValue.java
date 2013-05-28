/**
 * Copyright (c) 2009-2013 Politecnico di milano All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the LICENSE.MD included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */


package rmc.mat;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

abstract public class RmcValue {
	abstract public BigDecimal calculate();
	abstract public List<List<RmcAtomicValue>> getSumOfProducts();
	abstract public String toStringValue();
	
	public RmcValue derivateWithRespectTo(RmcVariables rmcVariables, int variableIdToDerive) {
		RmcValue derivate = null; 
		for(List<RmcAtomicValue> aProductOfTerms: this.getSumOfProducts()) {
			RmcIndexOfProductTerms indexOfProductTerms = new RmcIndexOfProductTerms();
			for(RmcAtomicValue aTerm: aProductOfTerms) {
				aTerm.updateIndexOfProductTerms(indexOfProductTerms);
			}
			BigDecimal numericalTerm = indexOfProductTerms.getNumericalTerm();
			Map<Integer, Integer> variablesOccurences = indexOfProductTerms.getVariables();
			if(!variablesOccurences.containsKey(variableIdToDerive)) {
				continue;
			}						
			numericalTerm = numericalTerm.multiply(new BigDecimal(variablesOccurences.get(variableIdToDerive)));
			RmcValue aDerivateTerm = new RmcDecimal(numericalTerm);
			for(int variableId: variablesOccurences.keySet()) {
				int variableOccurence = variablesOccurences.get(variableId);
				if(variableId == variableIdToDerive) {
					variableOccurence--;
					if(variableOccurence == 1) continue;
				}
				for(int i=0; i<variableOccurence; i++) {
					aDerivateTerm = new RmcMultiplication(aDerivateTerm, new RmcVariable(rmcVariables, variableId));
				}
			}
			if(derivate==null) {
				derivate = aDerivateTerm;
			}else {
				derivate = new RmcSum(derivate, aDerivateTerm);
			}
		}
		if(derivate==null) {
			derivate = new RmcDecimal(new BigDecimal(0));
		}
		return derivate;
	}
	class RmcIndexOfProductTerms {
		private BigDecimal numericalFactor = new BigDecimal(1);
		private Map<Integer, Integer> variableOccurrences = new HashMap<Integer, Integer>(); 
		public void incrementOccurrenceOfVariableId(int variableId) {
			int currentVariableOccurrences = 0;
			if(variableOccurrences.containsKey(variableId)) {
				currentVariableOccurrences = variableOccurrences.get(variableId);
			}
			variableOccurrences.put(variableId, currentVariableOccurrences+1);
		}
		public void multiplyNumericFactorFor(BigDecimal toMultiply) {
			numericalFactor = numericalFactor.multiply(toMultiply);
		}
		public BigDecimal getNumericalTerm() {
			return numericalFactor;
		}
		public Map<Integer, Integer> getVariables() {
			return variableOccurrences;
		}
	}
}
