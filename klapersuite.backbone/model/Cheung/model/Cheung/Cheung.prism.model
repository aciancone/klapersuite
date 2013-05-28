
		dtmc

		// Constant for the fail state of a module
		const int fail = 0;
		
		// Constant for the success state of a module
		const int success = 1;
		
		const int fakeStart = 2;
		
		
		
	module M1 s_M1:[0..14] init fakeStart;
	
		
	[
	call_Workload_5_M1
] s_M1 = fakeStart ->
		1:(s_M1' = 3);
		
	[
	ret_Workload_5_M1
] s_M1 = success ->
		1:(s_M1' = fakeStart);
	
	[
	ret_Workload_5_M1
] s_M1 = fail ->
		1:(s_M1' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M1 = 3
 ->
				
				
	1.0:(s_M1' = 5);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
			
	// 
	[] s_M1 = 5
 ->
				
	(0.6*(1-0.0010)):(s_M1' = 6) +

	(0.2*(1-0.0010)):(s_M1' = 7) +

	(0.2*(1-0.0010)):(s_M1' = 8) +

				
	(((1-(0.6*(1-0.0010)))-(0.2*(1-0.0010)))-(0.2*(1-0.0010))):(s_M1' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M1 = 6
 ->
				
	(0.7*(1-0.02)):(s_M1' = 7) +

	(0.3*(1-0.02)):(s_M1' = 9) +

				
	((1-(0.7*(1-0.02)))-(0.3*(1-0.02))):(s_M1' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M1 = 7
 ->
				
	(1.0*(1-0.01)):(s_M1' = 9) +

				
	(1-(1.0*(1-0.01))):(s_M1' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M1 = 8
 ->
				
	(0.4*(1-0.03)):(s_M1' = 9) +

	(0.6*(1-0.03)):(s_M1' = 10) +

				
	((1-(0.4*(1-0.03)))-(0.6*(1-0.03))):(s_M1' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M1 = 9
 ->
				
	(0.4*(1-0.05)):(s_M1' = 11) +

	(0.6*(1-0.05)):(s_M1' = 12) +

				
	((1-(0.4*(1-0.05)))-(0.6*(1-0.05))):(s_M1' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M1 = 10
 ->
				
	(0.3*(1-0.0050)):(s_M1' = 7) +

	(0.3*(1-0.0050)):(s_M1' = 11) +

	(0.1*(1-0.0050)):(s_M1' = 12) +

	(0.3*(1-0.0050)):(s_M1' = 13) +

				
	((((1-(0.3*(1-0.0050)))-(0.3*(1-0.0050)))-(0.1*(1-0.0050)))-(0.3*(1-0.0050))):(s_M1' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M1 = 11
 ->
				
	(0.5*(1-0.015)):(s_M1' = 6) +

	(0.5*(1-0.015)):(s_M1' = 13) +

				
	((1-(0.5*(1-0.015)))-(0.5*(1-0.015))):(s_M1' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M1 = 12
 ->
				
	(0.25*(1-0.05)):(s_M1' = 8) +

	(0.75*(1-0.05)):(s_M1' = 14) +

				
	((1-(0.25*(1-0.05)))-(0.75*(1-0.05))):(s_M1' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M1 = 13
 ->
				
	(0.1*(1-0.025)):(s_M1' = 12) +

	(0.9*(1-0.025)):(s_M1' = 14) +

				
	((1-(0.1*(1-0.025)))-(0.9*(1-0.025))):(s_M1' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M1 = 14
 ->
				
	(1.0*(1-0.015)):(s_M1' = 4) +

				
	(1-(1.0*(1-0.015))):(s_M1' = fail);

		
	

	
	


	
	[] s_M1 = 4 -> 1:(s_M1' = success);

	
	
		[] s_M1 = fakeStart -> 1:(s_M1' = fakeStart);
	
	
	[] s_M1 = fail -> 1:(s_M1' = fail);

	endmodule

	module Workload s_Workload:[0..6] init fakeStart;
	
		[] s_Workload = fakeStart -> 1:(s_Workload' = 3);
	
	
	
	
	
		
			
	// 
	[] s_Workload = 3
 ->
				
				
	1.0:(s_Workload' = 5);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	
	[
	call_Workload_5_M1
] s_Workload = 5 ->
		1:(s_Workload' = 6);
		
	[
	ret_Workload_5_M1
] s_Workload = 6 & s_M1 = success ->
		1:(s_Workload' = 4);
			
	[
	ret_Workload_5_M1
] s_Workload = 6 & s_M1 = fail ->
		1:(s_Workload' = fail);



	
	[] s_Workload = 4 -> 1:(s_Workload' = success);

	
	
		[] s_Workload = success -> 1:(s_Workload' = success);
	
	
	[] s_Workload = fail -> 1:(s_Workload' = fail);

	endmodule

	