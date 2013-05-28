
		dtmc

		// Constant for the fail state of a module
		const int fail = 0;
		
		// Constant for the success state of a module
		const int success = 1;
		
		const int fakeStart = 2;
		
		
		
	module M25 s_M25:[0..5] init fakeStart;
	
		
	[
	call_M21_5_M25
] s_M25 = fakeStart ->
		1:(s_M25' = 3);
		
	[
	ret_M21_5_M25
] s_M25 = success ->
		1:(s_M25' = fakeStart);
	
	[
	ret_M21_5_M25
] s_M25 = fail ->
		1:(s_M25' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M25 = 3
 ->
				
				
	1.0:(s_M25' = 5);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
			
	// 
	[] s_M25 = 5
 ->
				
	(1.0*(1-4.2E-4)):(s_M25' = 4) +

				
	(1-(1.0*(1-4.2E-4))):(s_M25' = fail);

		
	

	
	


	
	[] s_M25 = 4 -> 1:(s_M25' = success);

	
	
		[] s_M25 = fakeStart -> 1:(s_M25' = fakeStart);
	
	
	[] s_M25 = fail -> 1:(s_M25' = fail);

	endmodule

	module M21 s_M21:[0..7] init fakeStart;
	
		
	[
	call_M17_5_M21
] s_M21 = fakeStart ->
		1:(s_M21' = 3);
		
	[
	ret_M17_5_M21
] s_M21 = success ->
		1:(s_M21' = fakeStart);
	
	[
	ret_M17_5_M21
] s_M21 = fail ->
		1:(s_M21' = fail);

	[
	call_M47_8_M21
] s_M21 = fakeStart ->
		1:(s_M21' = 3);
		
	[
	ret_M47_8_M21
] s_M21 = success ->
		1:(s_M21' = fakeStart);
	
	[
	ret_M47_8_M21
] s_M21 = fail ->
		1:(s_M21' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M21 = 3
 ->
				
				
	1.0:(s_M21' = 6);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
	

	
	
	[
	call_M21_5_M25
] s_M21 = 5 ->
		1:(s_M21' = 7);
		
	[
	ret_M21_5_M25
] s_M21 = 7 & s_M25 = success ->
		1:(s_M21' = 4);
			
	[
	ret_M21_5_M25
] s_M21 = 7 & s_M25 = fail ->
		1:(s_M21' = fail);



	
	
		
			
	// 
	[] s_M21 = 6
 ->
				
	(1.0*(1-4.9E-4)):(s_M21' = 5) +

				
	(1-(1.0*(1-4.9E-4))):(s_M21' = fail);

		
	

	
	


	
	[] s_M21 = 4 -> 1:(s_M21' = success);

	
	
		[] s_M21 = fakeStart -> 1:(s_M21' = fakeStart);
	
	
	[] s_M21 = fail -> 1:(s_M21' = fail);

	endmodule

	module M17 s_M17:[0..7] init fakeStart;
	
		
	[
	call_M13_5_M17
] s_M17 = fakeStart ->
		1:(s_M17' = 3);
		
	[
	ret_M13_5_M17
] s_M17 = success ->
		1:(s_M17' = fakeStart);
	
	[
	ret_M13_5_M17
] s_M17 = fail ->
		1:(s_M17' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M17 = 3
 ->
				
				
	1.0:(s_M17' = 6);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
	

	
	
	[
	call_M17_5_M21
] s_M17 = 5 ->
		1:(s_M17' = 7);
		
	[
	ret_M17_5_M21
] s_M17 = 7 & s_M21 = success ->
		1:(s_M17' = 4);
			
	[
	ret_M17_5_M21
] s_M17 = 7 & s_M21 = fail ->
		1:(s_M17' = fail);



	
	
		
			
	// 
	[] s_M17 = 6
 ->
				
	(1.0*(1-2.3E-4)):(s_M17' = 5) +

				
	(1-(1.0*(1-2.3E-4))):(s_M17' = fail);

		
	

	
	


	
	[] s_M17 = 4 -> 1:(s_M17' = success);

	
	
		[] s_M17 = fakeStart -> 1:(s_M17' = fakeStart);
	
	
	[] s_M17 = fail -> 1:(s_M17' = fail);

	endmodule

	module M13 s_M13:[0..6] init fakeStart;
	
		
	[
	call_M9_5_M13
] s_M13 = fakeStart ->
		1:(s_M13' = 3);
		
	[
	ret_M9_5_M13
] s_M13 = success ->
		1:(s_M13' = fakeStart);
	
	[
	ret_M9_5_M13
] s_M13 = fail ->
		1:(s_M13' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M13 = 3
 ->
				
				
	1.0:(s_M13' = 5);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
	

	
	
	[
	call_M13_5_M17
] s_M13 = 5 ->
		1:(s_M13' = 6);
		
	[
	ret_M13_5_M17
] s_M13 = 6 & s_M17 = success ->
		1:(s_M13' = 4);
			
	[
	ret_M13_5_M17
] s_M13 = 6 & s_M17 = fail ->
		1:(s_M13' = fail);



	
	[] s_M13 = 4 -> 1:(s_M13' = success);

	
	
		[] s_M13 = fakeStart -> 1:(s_M13' = fakeStart);
	
	
	[] s_M13 = fail -> 1:(s_M13' = fail);

	endmodule

	module M9 s_M9:[0..7] init fakeStart;
	
		
	[
	call_M5_5_M9
] s_M9 = fakeStart ->
		1:(s_M9' = 3);
		
	[
	ret_M5_5_M9
] s_M9 = success ->
		1:(s_M9' = fakeStart);
	
	[
	ret_M5_5_M9
] s_M9 = fail ->
		1:(s_M9' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M9 = 3
 ->
				
				
	1.0:(s_M9' = 6);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
	

	
	
	[
	call_M9_5_M13
] s_M9 = 5 ->
		1:(s_M9' = 7);
		
	[
	ret_M9_5_M13
] s_M9 = 7 & s_M13 = success ->
		1:(s_M9' = 4);
			
	[
	ret_M9_5_M13
] s_M9 = 7 & s_M13 = fail ->
		1:(s_M9' = fail);



	
	
		
			
	// 
	[] s_M9 = 6
 ->
				
	(1.0*(1-1.2E-4)):(s_M9' = 5) +

				
	(1-(1.0*(1-1.2E-4))):(s_M9' = fail);

		
	

	
	


	
	[] s_M9 = 4 -> 1:(s_M9' = success);

	
	
		[] s_M9 = fakeStart -> 1:(s_M9' = fakeStart);
	
	
	[] s_M9 = fail -> 1:(s_M9' = fail);

	endmodule

	module M58 s_M58:[0..5] init fakeStart;
	
		
	[
	call_M54_5_M58
] s_M58 = fakeStart ->
		1:(s_M58' = 3);
		
	[
	ret_M54_5_M58
] s_M58 = success ->
		1:(s_M58' = fakeStart);
	
	[
	ret_M54_5_M58
] s_M58 = fail ->
		1:(s_M58' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M58 = 3
 ->
				
				
	1.0:(s_M58' = 5);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
			
	// 
	[] s_M58 = 5
 ->
				
	(1.0*(1-7.1E-4)):(s_M58' = 4) +

				
	(1-(1.0*(1-7.1E-4))):(s_M58' = fail);

		
	

	
	


	
	[] s_M58 = 4 -> 1:(s_M58' = success);

	
	
		[] s_M58 = fakeStart -> 1:(s_M58' = fakeStart);
	
	
	[] s_M58 = fail -> 1:(s_M58' = fail);

	endmodule

	module M54 s_M54:[0..6] init fakeStart;
	
		
	[
	call_M47_3_M54
] s_M54 = fakeStart ->
		1:(s_M54' = 3);
		
	[
	ret_M47_3_M54
] s_M54 = success ->
		1:(s_M54' = fakeStart);
	
	[
	ret_M47_3_M54
] s_M54 = fail ->
		1:(s_M54' = fail);

	[
	call_M47_4_M54
] s_M54 = fakeStart ->
		1:(s_M54' = 3);
		
	[
	ret_M47_4_M54
] s_M54 = success ->
		1:(s_M54' = fakeStart);
	
	[
	ret_M47_4_M54
] s_M54 = fail ->
		1:(s_M54' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M54 = 3
 ->
				
				
	1.0:(s_M54' = 5);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
	

	
	
	[
	call_M54_5_M58
] s_M54 = 5 ->
		1:(s_M54' = 6);
		
	[
	ret_M54_5_M58
] s_M54 = 6 & s_M58 = success ->
		1:(s_M54' = 4);
			
	[
	ret_M54_5_M58
] s_M54 = 6 & s_M58 = fail ->
		1:(s_M54' = fail);



	
	[] s_M54 = 4 -> 1:(s_M54' = success);

	
	
		[] s_M54 = fakeStart -> 1:(s_M54' = fakeStart);
	
	
	[] s_M54 = fail -> 1:(s_M54' = fail);

	endmodule

	module M47 s_M47:[0..13] init fakeStart;
	
		
	[
	call_M41_7_M47
] s_M47 = fakeStart ->
		1:(s_M47' = 6);
		
	[
	ret_M41_7_M47
] s_M47 = success ->
		1:(s_M47' = fakeStart);
	
	[
	ret_M41_7_M47
] s_M47 = fail ->
		1:(s_M47' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M47 = 6
 ->
				
				
	1.0:(s_M47' = 9);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	
	[
	call_M47_3_M54
] s_M47 = 3 ->
		1:(s_M47' = 12);
		
	[
	ret_M47_3_M54
] s_M47 = 12 & s_M54 = success ->
		1:(s_M47' = 4);
			
	[
	ret_M47_3_M54
] s_M47 = 12 & s_M54 = fail ->
		1:(s_M47' = fail);



	
	
		
	

	
	
	[
	call_M47_4_M54
] s_M47 = 4 ->
		1:(s_M47' = 13);
		
	[
	ret_M47_4_M54
] s_M47 = 13 & s_M54 = success ->
		1:(s_M47' = 5);
			
	[
	ret_M47_4_M54
] s_M47 = 13 & s_M54 = fail ->
		1:(s_M47' = fail);



	
	
		
			
	// 
	[] s_M47 = 5
 ->
				
				
	(1.0*(1-0.0)):(s_M47' = 10);

		
	

	
	


	
	
		
	

	
	


	
	
		
	

	
	
	[
	call_M47_8_M21
] s_M47 = 8 ->
		1:(s_M47' = 11);
		
	[
	ret_M47_8_M21
] s_M47 = 11 & s_M21 = success ->
		1:(s_M47' = 7);
			
	[
	ret_M47_8_M21
] s_M47 = 11 & s_M21 = fail ->
		1:(s_M47' = fail);



	
	
		
			
	// 
	[] s_M47 = 9
 ->
				
	(1.0*(1-6.6E-4)):(s_M47' = 3) +

				
	(1-(1.0*(1-6.6E-4))):(s_M47' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M47 = 10
 ->
				
	(1.0*(1-8.8E-4)):(s_M47' = 8) +

				
	(1-(1.0*(1-8.8E-4))):(s_M47' = fail);

		
	

	
	


	
	[] s_M47 = 7 -> 1:(s_M47' = success);

	
	
		[] s_M47 = fakeStart -> 1:(s_M47' = fakeStart);
	
	
	[] s_M47 = fail -> 1:(s_M47' = fail);

	endmodule

	module M67 s_M67:[0..5] init fakeStart;
	
		
	[
	call_M63_5_M67
] s_M67 = fakeStart ->
		1:(s_M67' = 3);
		
	[
	ret_M63_5_M67
] s_M67 = success ->
		1:(s_M67' = fakeStart);
	
	[
	ret_M63_5_M67
] s_M67 = fail ->
		1:(s_M67' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M67 = 3
 ->
				
				
	1.0:(s_M67' = 5);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
			
	// 
	[] s_M67 = 5
 ->
				
	(1.0*(1-3.3E-4)):(s_M67' = 4) +

				
	(1-(1.0*(1-3.3E-4))):(s_M67' = fail);

		
	

	
	


	
	[] s_M67 = 4 -> 1:(s_M67' = success);

	
	
		[] s_M67 = fakeStart -> 1:(s_M67' = fakeStart);
	
	
	[] s_M67 = fail -> 1:(s_M67' = fail);

	endmodule

	module M63 s_M63:[0..7] init fakeStart;
	
		
	[
	call_M41_8_M63
] s_M63 = fakeStart ->
		1:(s_M63' = 3);
		
	[
	ret_M41_8_M63
] s_M63 = success ->
		1:(s_M63' = fakeStart);
	
	[
	ret_M41_8_M63
] s_M63 = fail ->
		1:(s_M63' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M63 = 3
 ->
				
				
	1.0:(s_M63' = 6);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
	

	
	
	[
	call_M63_5_M67
] s_M63 = 5 ->
		1:(s_M63' = 7);
		
	[
	ret_M63_5_M67
] s_M63 = 7 & s_M67 = success ->
		1:(s_M63' = 4);
			
	[
	ret_M63_5_M67
] s_M63 = 7 & s_M67 = fail ->
		1:(s_M63' = fail);



	
	
		
			
	// 
	[] s_M63 = 6
 ->
				
	(1.0*(1-6.9E-4)):(s_M63' = 5) +

				
	(1-(1.0*(1-6.9E-4))):(s_M63' = fail);

		
	

	
	


	
	[] s_M63 = 4 -> 1:(s_M63' = success);

	
	
		[] s_M63 = fakeStart -> 1:(s_M63' = fakeStart);
	
	
	[] s_M63 = fail -> 1:(s_M63' = fail);

	endmodule

	module M41 s_M41:[0..11] init fakeStart;
	
		
	[
	call_M37_5_M41
] s_M41 = fakeStart ->
		1:(s_M41' = 3);
		
	[
	ret_M37_5_M41
] s_M41 = success ->
		1:(s_M41' = fakeStart);
	
	[
	ret_M37_5_M41
] s_M41 = fail ->
		1:(s_M41' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M41 = 3
 ->
				
				
	1.0:(s_M41' = 5);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
			
	// 
	[] s_M41 = 5
 ->
				
	(1.0*(1-1.1E-4)):(s_M41' = 9) +

				
	(1-(1.0*(1-1.1E-4))):(s_M41' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M41 = 6
 ->
				
	(1.0*(1-0)):(s_M41' = 4) +

				
	(1-(1.0*(1-0))):(s_M41' = fail);

		
	

	
	


	
	
		
	

	
	
	[
	call_M41_7_M47
] s_M41 = 7 ->
		1:(s_M41' = 10);
		
	[
	ret_M41_7_M47
] s_M41 = 10 & s_M47 = success ->
		1:(s_M41' = 6);
			
	[
	ret_M41_7_M47
] s_M41 = 10 & s_M47 = fail ->
		1:(s_M41' = fail);



	
	
		
	

	
	
	[
	call_M41_8_M63
] s_M41 = 8 ->
		1:(s_M41' = 11);
		
	[
	ret_M41_8_M63
] s_M41 = 11 & s_M63 = success ->
		1:(s_M41' = 6);
			
	[
	ret_M41_8_M63
] s_M41 = 11 & s_M63 = fail ->
		1:(s_M41' = fail);



	
	
		
			
	// 
	[] s_M41 = 9
 ->
				
	0.3:(s_M41' = 7) +

				
	0.7:(s_M41' = 8);

		
	

	
	


	
	[] s_M41 = 4 -> 1:(s_M41' = success);

	
	
		[] s_M41 = fakeStart -> 1:(s_M41' = fakeStart);
	
	
	[] s_M41 = fail -> 1:(s_M41' = fail);

	endmodule

	module M37 s_M37:[0..6] init fakeStart;
	
		
	[
	call_M33_5_M37
] s_M37 = fakeStart ->
		1:(s_M37' = 3);
		
	[
	ret_M33_5_M37
] s_M37 = success ->
		1:(s_M37' = fakeStart);
	
	[
	ret_M33_5_M37
] s_M37 = fail ->
		1:(s_M37' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M37 = 3
 ->
				
				
	1.0:(s_M37' = 5);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
	

	
	
	[
	call_M37_5_M41
] s_M37 = 5 ->
		1:(s_M37' = 6);
		
	[
	ret_M37_5_M41
] s_M37 = 6 & s_M41 = success ->
		1:(s_M37' = 4);
			
	[
	ret_M37_5_M41
] s_M37 = 6 & s_M41 = fail ->
		1:(s_M37' = fail);



	
	[] s_M37 = 4 -> 1:(s_M37' = success);

	
	
		[] s_M37 = fakeStart -> 1:(s_M37' = fakeStart);
	
	
	[] s_M37 = fail -> 1:(s_M37' = fail);

	endmodule

	module M33 s_M33:[0..7] init fakeStart;
	
		
	[
	call_M5_6_M33
] s_M33 = fakeStart ->
		1:(s_M33' = 3);
		
	[
	ret_M5_6_M33
] s_M33 = success ->
		1:(s_M33' = fakeStart);
	
	[
	ret_M5_6_M33
] s_M33 = fail ->
		1:(s_M33' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M33 = 3
 ->
				
				
	1.0:(s_M33' = 6);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
	

	
	
	[
	call_M33_5_M37
] s_M33 = 5 ->
		1:(s_M33' = 7);
		
	[
	ret_M33_5_M37
] s_M33 = 7 & s_M37 = success ->
		1:(s_M33' = 4);
			
	[
	ret_M33_5_M37
] s_M33 = 7 & s_M37 = fail ->
		1:(s_M33' = fail);



	
	
		
			
	// 
	[] s_M33 = 6
 ->
				
	(1.0*(1-1.7E-4)):(s_M33' = 5) +

				
	(1-(1.0*(1-1.7E-4))):(s_M33' = fail);

		
	

	
	


	
	[] s_M33 = 4 -> 1:(s_M33' = success);

	
	
		[] s_M33 = fakeStart -> 1:(s_M33' = fakeStart);
	
	
	[] s_M33 = fail -> 1:(s_M33' = fail);

	endmodule

	module M5 s_M5:[0..10] init fakeStart;
	
		
	[
	call_M1_5_M5
] s_M5 = fakeStart ->
		1:(s_M5' = 3);
		
	[
	ret_M1_5_M5
] s_M5 = success ->
		1:(s_M5' = fakeStart);
	
	[
	ret_M1_5_M5
] s_M5 = fail ->
		1:(s_M5' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M5 = 3
 ->
				
				
	1.0:(s_M5' = 8);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
	

	
	
	[
	call_M5_5_M9
] s_M5 = 5 ->
		1:(s_M5' = 9);
		
	[
	ret_M5_5_M9
] s_M5 = 9 & s_M9 = success ->
		1:(s_M5' = 7);
			
	[
	ret_M5_5_M9
] s_M5 = 9 & s_M9 = fail ->
		1:(s_M5' = fail);



	
	
		
	

	
	
	[
	call_M5_6_M33
] s_M5 = 6 ->
		1:(s_M5' = 10);
		
	[
	ret_M5_6_M33
] s_M5 = 10 & s_M33 = success ->
		1:(s_M5' = 7);
			
	[
	ret_M5_6_M33
] s_M5 = 10 & s_M33 = fail ->
		1:(s_M5' = fail);



	
	
		
			
	// 
	[] s_M5 = 7
 ->
				
	(1.0*(1-0)):(s_M5' = 4) +

				
	(1-(1.0*(1-0))):(s_M5' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M5 = 8
 ->
				
	0.9:(s_M5' = 5) +

				
	0.1:(s_M5' = 6);

		
	

	
	


	
	[] s_M5 = 4 -> 1:(s_M5' = success);

	
	
		[] s_M5 = fakeStart -> 1:(s_M5' = fakeStart);
	
	
	[] s_M5 = fail -> 1:(s_M5' = fail);

	endmodule

	module M1 s_M1:[0..6] init fakeStart;
	
		
	[
	call_M76_5_M1
] s_M1 = fakeStart ->
		1:(s_M1' = 3);
		
	[
	ret_M76_5_M1
] s_M1 = success ->
		1:(s_M1' = fakeStart);
	
	[
	ret_M76_5_M1
] s_M1 = fail ->
		1:(s_M1' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M1 = 3
 ->
				
				
	1.0:(s_M1' = 5);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
	

	
	
	[
	call_M1_5_M5
] s_M1 = 5 ->
		1:(s_M1' = 6);
		
	[
	ret_M1_5_M5
] s_M1 = 6 & s_M5 = success ->
		1:(s_M1' = 4);
			
	[
	ret_M1_5_M5
] s_M1 = 6 & s_M5 = fail ->
		1:(s_M1' = fail);



	
	[] s_M1 = 4 -> 1:(s_M1' = success);

	
	
		[] s_M1 = fakeStart -> 1:(s_M1' = fakeStart);
	
	
	[] s_M1 = fail -> 1:(s_M1' = fail);

	endmodule

	module M76 s_M76:[0..6] init fakeStart;
	
		
	[
	call_Workload_5_M76
] s_M76 = fakeStart ->
		1:(s_M76' = 3);
		
	[
	ret_Workload_5_M76
] s_M76 = success ->
		1:(s_M76' = fakeStart);
	
	[
	ret_Workload_5_M76
] s_M76 = fail ->
		1:(s_M76' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M76 = 3
 ->
				
				
	1.0:(s_M76' = 5);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
	

	
	
	[
	call_M76_5_M1
] s_M76 = 5 ->
		1:(s_M76' = 6);
		
	[
	ret_M76_5_M1
] s_M76 = 6 & s_M1 = success ->
		1:(s_M76' = 4);
			
	[
	ret_M76_5_M1
] s_M76 = 6 & s_M1 = fail ->
		1:(s_M76' = fail);



	
	[] s_M76 = 4 -> 1:(s_M76' = success);

	
	
		[] s_M76 = fakeStart -> 1:(s_M76' = fakeStart);
	
	
	[] s_M76 = fail -> 1:(s_M76' = fail);

	endmodule

	module Workload s_Workload:[0..6] init fakeStart;
	
		[] s_Workload = fakeStart -> 1:(s_Workload' = 3);
	
	
	
	
	
		
			
	// 
	[] s_Workload = 3
 ->
				
				
	1.0:(s_Workload' = 5);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	
	[
	call_Workload_5_M76
] s_Workload = 5 ->
		1:(s_Workload' = 6);
		
	[
	ret_Workload_5_M76
] s_Workload = 6 & s_M76 = success ->
		1:(s_Workload' = 4);
			
	[
	ret_Workload_5_M76
] s_Workload = 6 & s_M76 = fail ->
		1:(s_Workload' = fail);



	
	[] s_Workload = 4 -> 1:(s_Workload' = success);

	
	
		[] s_Workload = success -> 1:(s_Workload' = success);
	
	
	[] s_Workload = fail -> 1:(s_Workload' = fail);

	endmodule

	