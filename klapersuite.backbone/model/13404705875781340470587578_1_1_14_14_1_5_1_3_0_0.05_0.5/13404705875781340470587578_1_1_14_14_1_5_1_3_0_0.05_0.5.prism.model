
		dtmc

		// Constant for the fail state of a module
		const int fail = 0;
		
		// Constant for the success state of a module
		const int success = 1;
		
		const int fakeStart = 2;
		
		
		
	module M1 s_M1:[0..5] init fakeStart;
	
		
	[
	call_M5_6_M1
] s_M1 = fakeStart ->
		1:(s_M1' = 3);
		
	[
	ret_M5_6_M1
] s_M1 = success ->
		1:(s_M1' = fakeStart);
	
	[
	ret_M5_6_M1
] s_M1 = fail ->
		1:(s_M1' = fail);

	[
	call_M5_7_M1
] s_M1 = fakeStart ->
		1:(s_M1' = 3);
		
	[
	ret_M5_7_M1
] s_M1 = success ->
		1:(s_M1' = fakeStart);
	
	[
	ret_M5_7_M1
] s_M1 = fail ->
		1:(s_M1' = fail);

	[
	call_M12_7_M1
] s_M1 = fakeStart ->
		1:(s_M1' = 3);
		
	[
	ret_M12_7_M1
] s_M1 = success ->
		1:(s_M1' = fakeStart);
	
	[
	ret_M12_7_M1
] s_M1 = fail ->
		1:(s_M1' = fail);

	[
	call_M19_9_M1
] s_M1 = fakeStart ->
		1:(s_M1' = 3);
		
	[
	ret_M19_9_M1
] s_M1 = success ->
		1:(s_M1' = fakeStart);
	
	[
	ret_M19_9_M1
] s_M1 = fail ->
		1:(s_M1' = fail);

	[
	call_M27_7_M1
] s_M1 = fakeStart ->
		1:(s_M1' = 3);
		
	[
	ret_M27_7_M1
] s_M1 = success ->
		1:(s_M1' = fakeStart);
	
	[
	ret_M27_7_M1
] s_M1 = fail ->
		1:(s_M1' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M1 = 3
 ->
				
				
	1.0:(s_M1' = 5);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
			
	// 
	[] s_M1 = 5
 ->
				
	(1.0*(1-8.58266866998747E-6)):(s_M1' = 4) +

				
	(1-(1.0*(1-8.58266866998747E-6))):(s_M1' = fail);

		
	

	
	


	
	[] s_M1 = 4 -> 1:(s_M1' = success);

	
	
		[] s_M1 = fakeStart -> 1:(s_M1' = fakeStart);
	
	
	[] s_M1 = fail -> 1:(s_M1' = fail);

	endmodule

	module M5 s_M5:[0..10] init fakeStart;
	
		
	[
	call_M19_8_M5
] s_M5 = fakeStart ->
		1:(s_M5' = 3);
		
	[
	ret_M19_8_M5
] s_M5 = success ->
		1:(s_M5' = fakeStart);
	
	[
	ret_M19_8_M5
] s_M5 = fail ->
		1:(s_M5' = fail);

	[
	call_M27_8_M5
] s_M5 = fakeStart ->
		1:(s_M5' = 3);
		
	[
	ret_M27_8_M5
] s_M5 = success ->
		1:(s_M5' = fakeStart);
	
	[
	ret_M27_8_M5
] s_M5 = fail ->
		1:(s_M5' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M5 = 3
 ->
				
				
	1.0:(s_M5' = 8);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
			
	// 
	[] s_M5 = 5
 ->
				
	(1.0*(1-1.668624008743791E-6)):(s_M5' = 4) +

				
	(1-(1.0*(1-1.668624008743791E-6))):(s_M5' = fail);

		
	

	
	


	
	
		
	

	
	
	[
	call_M5_6_M1
] s_M5 = 6 ->
		1:(s_M5' = 9);
		
	[
	ret_M5_6_M1
] s_M5 = 9 & s_M1 = success ->
		1:(s_M5' = 5);
			
	[
	ret_M5_6_M1
] s_M5 = 9 & s_M1 = fail ->
		1:(s_M5' = fail);



	
	
		
	

	
	
	[
	call_M5_7_M1
] s_M5 = 7 ->
		1:(s_M5' = 10);
		
	[
	ret_M5_7_M1
] s_M5 = 10 & s_M1 = success ->
		1:(s_M5' = 4);
			
	[
	ret_M5_7_M1
] s_M5 = 10 & s_M1 = fail ->
		1:(s_M5' = fail);



	
	
		
			
	// 
	[] s_M5 = 8
 ->
				
	0.5:(s_M5' = 6) +

				
	0.5:(s_M5' = 7);

		
	

	
	


	
	[] s_M5 = 4 -> 1:(s_M5' = success);

	
	
		[] s_M5 = fakeStart -> 1:(s_M5' = fakeStart);
	
	
	[] s_M5 = fail -> 1:(s_M5' = fail);

	endmodule

	module M19 s_M19:[0..11] init fakeStart;
	
		
	[
	call_M34_6_M19
] s_M19 = fakeStart ->
		1:(s_M19' = 3);
		
	[
	ret_M34_6_M19
] s_M19 = success ->
		1:(s_M19' = fakeStart);
	
	[
	ret_M34_6_M19
] s_M19 = fail ->
		1:(s_M19' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M19 = 3
 ->
				
				
	1.0:(s_M19' = 8);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
			
	// 
	[] s_M19 = 5
 ->
				
	(1.0*(1-8.125739441311453E-7)):(s_M19' = 6) +

				
	(1-(1.0*(1-8.125739441311453E-7))):(s_M19' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M19 = 6
 ->
				
	(1.0*(1-6.686133474431699E-6)):(s_M19' = 9) +

				
	(1-(1.0*(1-6.686133474431699E-6))):(s_M19' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M19 = 7
 ->
				
	(1.0*(1-9.712643986858893E-7)):(s_M19' = 5) +

				
	(1-(1.0*(1-9.712643986858893E-7))):(s_M19' = fail);

		
	

	
	


	
	
		
	

	
	
	[
	call_M19_8_M5
] s_M19 = 8 ->
		1:(s_M19' = 10);
		
	[
	ret_M19_8_M5
] s_M19 = 10 & s_M5 = success ->
		1:(s_M19' = 7);
			
	[
	ret_M19_8_M5
] s_M19 = 10 & s_M5 = fail ->
		1:(s_M19' = fail);



	
	
		
	

	
	
	[
	call_M19_9_M1
] s_M19 = 9 ->
		1:(s_M19' = 11);
		
	[
	ret_M19_9_M1
] s_M19 = 11 & s_M1 = success ->
		1:(s_M19' = 4);
			
	[
	ret_M19_9_M1
] s_M19 = 11 & s_M1 = fail ->
		1:(s_M19' = fail);



	
	[] s_M19 = 4 -> 1:(s_M19' = success);

	
	
		[] s_M19 = fakeStart -> 1:(s_M19' = fakeStart);
	
	
	[] s_M19 = fail -> 1:(s_M19' = fail);

	endmodule

	module M12 s_M12:[0..9] init fakeStart;
	
		
	[
	call_M39_8_M12
] s_M12 = fakeStart ->
		1:(s_M12' = 3);
		
	[
	ret_M39_8_M12
] s_M12 = success ->
		1:(s_M12' = fakeStart);
	
	[
	ret_M39_8_M12
] s_M12 = fail ->
		1:(s_M12' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M12 = 3
 ->
				
				
	1.0:(s_M12' = 8);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
			
	// 
	[] s_M12 = 5
 ->
				
	(1.0*(1-3.350604401930468E-6)):(s_M12' = 6) +

				
	(1-(1.0*(1-3.350604401930468E-6))):(s_M12' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M12 = 6
 ->
				
	(1.0*(1-2.926582510553999E-6)):(s_M12' = 4) +

				
	(1-(1.0*(1-2.926582510553999E-6))):(s_M12' = fail);

		
	

	
	


	
	
		
	

	
	
	[
	call_M12_7_M1
] s_M12 = 7 ->
		1:(s_M12' = 9);
		
	[
	ret_M12_7_M1
] s_M12 = 9 & s_M1 = success ->
		1:(s_M12' = 4);
			
	[
	ret_M12_7_M1
] s_M12 = 9 & s_M1 = fail ->
		1:(s_M12' = fail);



	
	
		
			
	// 
	[] s_M12 = 8
 ->
				
	0.5:(s_M12' = 5) +

				
	0.5:(s_M12' = 7);

		
	

	
	


	
	[] s_M12 = 4 -> 1:(s_M12' = success);

	
	
		[] s_M12 = fakeStart -> 1:(s_M12' = fakeStart);
	
	
	[] s_M12 = fail -> 1:(s_M12' = fail);

	endmodule

	module M27 s_M27:[0..10] init fakeStart;
	
		
	[
	call_M39_9_M27
] s_M27 = fakeStart ->
		1:(s_M27' = 3);
		
	[
	ret_M39_9_M27
] s_M27 = success ->
		1:(s_M27' = fakeStart);
	
	[
	ret_M39_9_M27
] s_M27 = fail ->
		1:(s_M27' = fail);

	[
	call_M56_8_M27
] s_M27 = fakeStart ->
		1:(s_M27' = 3);
		
	[
	ret_M56_8_M27
] s_M27 = success ->
		1:(s_M27' = fakeStart);
	
	[
	ret_M56_8_M27
] s_M27 = fail ->
		1:(s_M27' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M27 = 3
 ->
				
				
	1.0:(s_M27' = 5);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
			
	// 
	[] s_M27 = 5
 ->
				
	(1.0*(1-2.840475190168945E-6)):(s_M27' = 6) +

				
	(1-(1.0*(1-2.840475190168945E-6))):(s_M27' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M27 = 6
 ->
				
	(1.0*(1-4.9194100029126275E-6)):(s_M27' = 7) +

				
	(1-(1.0*(1-4.9194100029126275E-6))):(s_M27' = fail);

		
	

	
	


	
	
		
	

	
	
	[
	call_M27_7_M1
] s_M27 = 7 ->
		1:(s_M27' = 9);
		
	[
	ret_M27_7_M1
] s_M27 = 9 & s_M1 = success ->
		1:(s_M27' = 8);
			
	[
	ret_M27_7_M1
] s_M27 = 9 & s_M1 = fail ->
		1:(s_M27' = fail);



	
	
		
	

	
	
	[
	call_M27_8_M5
] s_M27 = 8 ->
		1:(s_M27' = 10);
		
	[
	ret_M27_8_M5
] s_M27 = 10 & s_M5 = success ->
		1:(s_M27' = 4);
			
	[
	ret_M27_8_M5
] s_M27 = 10 & s_M5 = fail ->
		1:(s_M27' = fail);



	
	[] s_M27 = 4 -> 1:(s_M27' = success);

	
	
		[] s_M27 = fakeStart -> 1:(s_M27' = fakeStart);
	
	
	[] s_M27 = fail -> 1:(s_M27' = fail);

	endmodule

	module M34 s_M34:[0..7] init fakeStart;
	
		
	[
	call_M47_9_M34
] s_M34 = fakeStart ->
		1:(s_M34' = 3);
		
	[
	ret_M47_9_M34
] s_M34 = success ->
		1:(s_M34' = fakeStart);
	
	[
	ret_M47_9_M34
] s_M34 = fail ->
		1:(s_M34' = fail);

	[
	call_M64_7_M34
] s_M34 = fakeStart ->
		1:(s_M34' = 3);
		
	[
	ret_M64_7_M34
] s_M34 = success ->
		1:(s_M34' = fakeStart);
	
	[
	ret_M64_7_M34
] s_M34 = fail ->
		1:(s_M34' = fail);

	[
	call_M77_6_M34
] s_M34 = fakeStart ->
		1:(s_M34' = 3);
		
	[
	ret_M77_6_M34
] s_M34 = success ->
		1:(s_M34' = fakeStart);
	
	[
	ret_M77_6_M34
] s_M34 = fail ->
		1:(s_M34' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M34 = 3
 ->
				
				
	1.0:(s_M34' = 5);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
			
	// 
	[] s_M34 = 5
 ->
				
	(1.0*(1-1.5632581380486954E-6)):(s_M34' = 6) +

				
	(1-(1.0*(1-1.5632581380486954E-6))):(s_M34' = fail);

		
	

	
	


	
	
		
	

	
	
	[
	call_M34_6_M19
] s_M34 = 6 ->
		1:(s_M34' = 7);
		
	[
	ret_M34_6_M19
] s_M34 = 7 & s_M19 = success ->
		1:(s_M34' = 4);
			
	[
	ret_M34_6_M19
] s_M34 = 7 & s_M19 = fail ->
		1:(s_M34' = fail);



	
	[] s_M34 = 4 -> 1:(s_M34' = success);

	
	
		[] s_M34 = fakeStart -> 1:(s_M34' = fakeStart);
	
	
	[] s_M34 = fail -> 1:(s_M34' = fail);

	endmodule

	module M56 s_M56:[0..10] init fakeStart;
	
		
	[
	call_M71_7_M56
] s_M56 = fakeStart ->
		1:(s_M56' = 3);
		
	[
	ret_M71_7_M56
] s_M56 = success ->
		1:(s_M56' = fakeStart);
	
	[
	ret_M71_7_M56
] s_M56 = fail ->
		1:(s_M56' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M56 = 3
 ->
				
				
	1.0:(s_M56' = 9);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
			
	// 
	[] s_M56 = 5
 ->
				
	(1.0*(1-2.2012077351973858E-6)):(s_M56' = 8) +

				
	(1-(1.0*(1-2.2012077351973858E-6))):(s_M56' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M56 = 6
 ->
				
	(1.0*(1-3.412283604120603E-6)):(s_M56' = 4) +

				
	(1-(1.0*(1-3.412283604120603E-6))):(s_M56' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M56 = 7
 ->
				
	(1.0*(1-7.393496616714401E-6)):(s_M56' = 6) +

				
	(1-(1.0*(1-7.393496616714401E-6))):(s_M56' = fail);

		
	

	
	


	
	
		
	

	
	
	[
	call_M56_8_M27
] s_M56 = 8 ->
		1:(s_M56' = 10);
		
	[
	ret_M56_8_M27
] s_M56 = 10 & s_M27 = success ->
		1:(s_M56' = 4);
			
	[
	ret_M56_8_M27
] s_M56 = 10 & s_M27 = fail ->
		1:(s_M56' = fail);



	
	
		
			
	// 
	[] s_M56 = 9
 ->
				
	0.5:(s_M56' = 7) +

				
	0.5:(s_M56' = 5);

		
	

	
	


	
	[] s_M56 = 4 -> 1:(s_M56' = success);

	
	
		[] s_M56 = fakeStart -> 1:(s_M56' = fakeStart);
	
	
	[] s_M56 = fail -> 1:(s_M56' = fail);

	endmodule

	module M71 s_M71:[0..8] init fakeStart;
	
		
	[
	call_M83_9_M71
] s_M71 = fakeStart ->
		1:(s_M71' = 3);
		
	[
	ret_M83_9_M71
] s_M71 = success ->
		1:(s_M71' = fakeStart);
	
	[
	ret_M83_9_M71
] s_M71 = fail ->
		1:(s_M71' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M71 = 3
 ->
				
				
	1.0:(s_M71' = 6);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
			
	// 
	[] s_M71 = 5
 ->
				
	(1.0*(1-1.958784650923917E-6)):(s_M71' = 7) +

				
	(1-(1.0*(1-1.958784650923917E-6))):(s_M71' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M71 = 6
 ->
				
	(1.0*(1-5.699529083358357E-6)):(s_M71' = 5) +

				
	(1-(1.0*(1-5.699529083358357E-6))):(s_M71' = fail);

		
	

	
	


	
	
		
	

	
	
	[
	call_M71_7_M56
] s_M71 = 7 ->
		1:(s_M71' = 8);
		
	[
	ret_M71_7_M56
] s_M71 = 8 & s_M56 = success ->
		1:(s_M71' = 4);
			
	[
	ret_M71_7_M56
] s_M71 = 8 & s_M56 = fail ->
		1:(s_M71' = fail);



	
	[] s_M71 = 4 -> 1:(s_M71' = success);

	
	
		[] s_M71 = fakeStart -> 1:(s_M71' = fakeStart);
	
	
	[] s_M71 = fail -> 1:(s_M71' = fail);

	endmodule

	module M77 s_M77:[0..8] init fakeStart;
	
		
	[
	call_M91_6_M77
] s_M77 = fakeStart ->
		1:(s_M77' = 3);
		
	[
	ret_M91_6_M77
] s_M77 = success ->
		1:(s_M77' = fakeStart);
	
	[
	ret_M91_6_M77
] s_M77 = fail ->
		1:(s_M77' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M77 = 3
 ->
				
				
	1.0:(s_M77' = 7);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
			
	// 
	[] s_M77 = 5
 ->
				
	(1.0*(1-1.3573658179666381E-6)):(s_M77' = 6) +

				
	(1-(1.0*(1-1.3573658179666381E-6))):(s_M77' = fail);

		
	

	
	


	
	
		
	

	
	
	[
	call_M77_6_M34
] s_M77 = 6 ->
		1:(s_M77' = 8);
		
	[
	ret_M77_6_M34
] s_M77 = 8 & s_M34 = success ->
		1:(s_M77' = 4);
			
	[
	ret_M77_6_M34
] s_M77 = 8 & s_M34 = fail ->
		1:(s_M77' = fail);



	
	
		
			
	// 
	[] s_M77 = 7
 ->
				
	0.5:(s_M77' = 5) +

				
	0.5:(s_M77' = 4);

		
	

	
	


	
	[] s_M77 = 4 -> 1:(s_M77' = success);

	
	
		[] s_M77 = fakeStart -> 1:(s_M77' = fakeStart);
	
	
	[] s_M77 = fail -> 1:(s_M77' = fail);

	endmodule

	module M39 s_M39:[0..11] init fakeStart;
	
		
	[
	call_Workload_6_M39
] s_M39 = fakeStart ->
		1:(s_M39' = 3);
		
	[
	ret_Workload_6_M39
] s_M39 = success ->
		1:(s_M39' = fakeStart);
	
	[
	ret_Workload_6_M39
] s_M39 = fail ->
		1:(s_M39' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M39 = 3
 ->
				
				
	1.0:(s_M39' = 7);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
			
	// 
	[] s_M39 = 5
 ->
				
	(1.0*(1-6.190541625983315E-6)):(s_M39' = 9) +

				
	(1-(1.0*(1-6.190541625983315E-6))):(s_M39' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M39 = 6
 ->
				
	(1.0*(1-8.770732165430672E-6)):(s_M39' = 5) +

				
	(1-(1.0*(1-8.770732165430672E-6))):(s_M39' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M39 = 7
 ->
				
	(1.0*(1-4.48629862148664E-6)):(s_M39' = 8) +

				
	(1-(1.0*(1-4.48629862148664E-6))):(s_M39' = fail);

		
	

	
	


	
	
		
	

	
	
	[
	call_M39_8_M12
] s_M39 = 8 ->
		1:(s_M39' = 11);
		
	[
	ret_M39_8_M12
] s_M39 = 11 & s_M12 = success ->
		1:(s_M39' = 6);
			
	[
	ret_M39_8_M12
] s_M39 = 11 & s_M12 = fail ->
		1:(s_M39' = fail);



	
	
		
	

	
	
	[
	call_M39_9_M27
] s_M39 = 9 ->
		1:(s_M39' = 10);
		
	[
	ret_M39_9_M27
] s_M39 = 10 & s_M27 = success ->
		1:(s_M39' = 4);
			
	[
	ret_M39_9_M27
] s_M39 = 10 & s_M27 = fail ->
		1:(s_M39' = fail);



	
	[] s_M39 = 4 -> 1:(s_M39' = success);

	
	
		[] s_M39 = fakeStart -> 1:(s_M39' = fakeStart);
	
	
	[] s_M39 = fail -> 1:(s_M39' = fail);

	endmodule

	module M47 s_M47:[0..11] init fakeStart;
	
		
	[
	call_Workload_7_M47
] s_M47 = fakeStart ->
		1:(s_M47' = 3);
		
	[
	ret_Workload_7_M47
] s_M47 = success ->
		1:(s_M47' = fakeStart);
	
	[
	ret_Workload_7_M47
] s_M47 = fail ->
		1:(s_M47' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M47 = 3
 ->
				
				
	1.0:(s_M47' = 10);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
			
	// 
	[] s_M47 = 5
 ->
				
	(1.0*(1-2.5355498110002372E-6)):(s_M47' = 9) +

				
	(1-(1.0*(1-2.5355498110002372E-6))):(s_M47' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M47 = 6
 ->
				
	(1.0*(1-2.320645307918312E-6)):(s_M47' = 7) +

				
	(1-(1.0*(1-2.320645307918312E-6))):(s_M47' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M47 = 7
 ->
				
	(1.0*(1-5.474793852044968E-6)):(s_M47' = 4) +

				
	(1-(1.0*(1-5.474793852044968E-6))):(s_M47' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M47 = 8
 ->
				
	(1.0*(1-7.31336194803589E-6)):(s_M47' = 6) +

				
	(1-(1.0*(1-7.31336194803589E-6))):(s_M47' = fail);

		
	

	
	


	
	
		
	

	
	
	[
	call_M47_9_M34
] s_M47 = 9 ->
		1:(s_M47' = 11);
		
	[
	ret_M47_9_M34
] s_M47 = 11 & s_M34 = success ->
		1:(s_M47' = 4);
			
	[
	ret_M47_9_M34
] s_M47 = 11 & s_M34 = fail ->
		1:(s_M47' = fail);



	
	
		
			
	// 
	[] s_M47 = 10
 ->
				
	0.5:(s_M47' = 8) +

				
	0.5:(s_M47' = 5);

		
	

	
	


	
	[] s_M47 = 4 -> 1:(s_M47' = success);

	
	
		[] s_M47 = fakeStart -> 1:(s_M47' = fakeStart);
	
	
	[] s_M47 = fail -> 1:(s_M47' = fail);

	endmodule

	module M64 s_M64:[0..9] init fakeStart;
	
		
	[
	call_Workload_5_M64
] s_M64 = fakeStart ->
		1:(s_M64' = 3);
		
	[
	ret_Workload_5_M64
] s_M64 = success ->
		1:(s_M64' = fakeStart);
	
	[
	ret_Workload_5_M64
] s_M64 = fail ->
		1:(s_M64' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M64 = 3
 ->
				
				
	1.0:(s_M64' = 8);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
			
	// 
	[] s_M64 = 5
 ->
				
	(1.0*(1-3.946711785829393E-6)):(s_M64' = 7) +

				
	(1-(1.0*(1-3.946711785829393E-6))):(s_M64' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M64 = 6
 ->
				
	(1.0*(1-7.504203949793009E-6)):(s_M64' = 5) +

				
	(1-(1.0*(1-7.504203949793009E-6))):(s_M64' = fail);

		
	

	
	


	
	
		
	

	
	
	[
	call_M64_7_M34
] s_M64 = 7 ->
		1:(s_M64' = 9);
		
	[
	ret_M64_7_M34
] s_M64 = 9 & s_M34 = success ->
		1:(s_M64' = 4);
			
	[
	ret_M64_7_M34
] s_M64 = 9 & s_M34 = fail ->
		1:(s_M64' = fail);



	
	
		
			
	// 
	[] s_M64 = 8
 ->
				
	0.5:(s_M64' = 6) +

				
	0.5:(s_M64' = 4);

		
	

	
	


	
	[] s_M64 = 4 -> 1:(s_M64' = success);

	
	
		[] s_M64 = fakeStart -> 1:(s_M64' = fakeStart);
	
	
	[] s_M64 = fail -> 1:(s_M64' = fail);

	endmodule

	module M83 s_M83:[0..10] init fakeStart;
	
		
	[
	call_Workload_8_M83
] s_M83 = fakeStart ->
		1:(s_M83' = 3);
		
	[
	ret_Workload_8_M83
] s_M83 = success ->
		1:(s_M83' = fakeStart);
	
	[
	ret_Workload_8_M83
] s_M83 = fail ->
		1:(s_M83' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M83 = 3
 ->
				
				
	1.0:(s_M83' = 8);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
			
	// 
	[] s_M83 = 5
 ->
				
	(1.0*(1-8.015465027710889E-6)):(s_M83' = 7) +

				
	(1-(1.0*(1-8.015465027710889E-6))):(s_M83' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M83 = 6
 ->
				
	(1.0*(1-1.2821169548260514E-6)):(s_M83' = 5) +

				
	(1-(1.0*(1-1.2821169548260514E-6))):(s_M83' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M83 = 7
 ->
				
	(1.0*(1-4.94223922942183E-6)):(s_M83' = 9) +

				
	(1-(1.0*(1-4.94223922942183E-6))):(s_M83' = fail);

		
	

	
	


	
	
		
			
	// 
	[] s_M83 = 8
 ->
				
	(1.0*(1-2.972843958559679E-6)):(s_M83' = 6) +

				
	(1-(1.0*(1-2.972843958559679E-6))):(s_M83' = fail);

		
	

	
	


	
	
		
	

	
	
	[
	call_M83_9_M71
] s_M83 = 9 ->
		1:(s_M83' = 10);
		
	[
	ret_M83_9_M71
] s_M83 = 10 & s_M71 = success ->
		1:(s_M83' = 4);
			
	[
	ret_M83_9_M71
] s_M83 = 10 & s_M71 = fail ->
		1:(s_M83' = fail);



	
	[] s_M83 = 4 -> 1:(s_M83' = success);

	
	
		[] s_M83 = fakeStart -> 1:(s_M83' = fakeStart);
	
	
	[] s_M83 = fail -> 1:(s_M83' = fail);

	endmodule

	module M91 s_M91:[0..7] init fakeStart;
	
		
	[
	call_Workload_9_M91
] s_M91 = fakeStart ->
		1:(s_M91' = 3);
		
	[
	ret_Workload_9_M91
] s_M91 = success ->
		1:(s_M91' = fakeStart);
	
	[
	ret_Workload_9_M91
] s_M91 = fail ->
		1:(s_M91' = fail);

	
	
	
	
	
		
			
	// 
	[] s_M91 = 3
 ->
				
				
	1.0:(s_M91' = 5);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	


	
	
		
			
	// 
	[] s_M91 = 5
 ->
				
	(1.0*(1-7.111498234735336E-7)):(s_M91' = 6) +

				
	(1-(1.0*(1-7.111498234735336E-7))):(s_M91' = fail);

		
	

	
	


	
	
		
	

	
	
	[
	call_M91_6_M77
] s_M91 = 6 ->
		1:(s_M91' = 7);
		
	[
	ret_M91_6_M77
] s_M91 = 7 & s_M77 = success ->
		1:(s_M91' = 4);
			
	[
	ret_M91_6_M77
] s_M91 = 7 & s_M77 = fail ->
		1:(s_M91' = fail);



	
	[] s_M91 = 4 -> 1:(s_M91' = success);

	
	
		[] s_M91 = fakeStart -> 1:(s_M91' = fakeStart);
	
	
	[] s_M91 = fail -> 1:(s_M91' = fail);

	endmodule

	module Workload s_Workload:[0..14] init fakeStart;
	
		[] s_Workload = fakeStart -> 1:(s_Workload' = 3);
	
	
	
	
	
		
			
	// 
	[] s_Workload = 3
 ->
				
				
	1.0:(s_Workload' = 8);

		
	

	
	


	
	
	
		
	

	
	


	
	
		
	

	
	
	[
	call_Workload_5_M64
] s_Workload = 5 ->
		1:(s_Workload' = 11);
		
	[
	ret_Workload_5_M64
] s_Workload = 11 & s_M64 = success ->
		1:(s_Workload' = 7);
			
	[
	ret_Workload_5_M64
] s_Workload = 11 & s_M64 = fail ->
		1:(s_Workload' = fail);



	
	
		
	

	
	
	[
	call_Workload_6_M39
] s_Workload = 6 ->
		1:(s_Workload' = 12);
		
	[
	ret_Workload_6_M39
] s_Workload = 12 & s_M39 = success ->
		1:(s_Workload' = 9);
			
	[
	ret_Workload_6_M39
] s_Workload = 12 & s_M39 = fail ->
		1:(s_Workload' = fail);



	
	
		
	

	
	
	[
	call_Workload_7_M47
] s_Workload = 7 ->
		1:(s_Workload' = 14);
		
	[
	ret_Workload_7_M47
] s_Workload = 14 & s_M47 = success ->
		1:(s_Workload' = 6);
			
	[
	ret_Workload_7_M47
] s_Workload = 14 & s_M47 = fail ->
		1:(s_Workload' = fail);



	
	
		
	

	
	
	[
	call_Workload_8_M83
] s_Workload = 8 ->
		1:(s_Workload' = 13);
		
	[
	ret_Workload_8_M83
] s_Workload = 13 & s_M83 = success ->
		1:(s_Workload' = 5);
			
	[
	ret_Workload_8_M83
] s_Workload = 13 & s_M83 = fail ->
		1:(s_Workload' = fail);



	
	
		
	

	
	
	[
	call_Workload_9_M91
] s_Workload = 9 ->
		1:(s_Workload' = 10);
		
	[
	ret_Workload_9_M91
] s_Workload = 10 & s_M91 = success ->
		1:(s_Workload' = 4);
			
	[
	ret_Workload_9_M91
] s_Workload = 10 & s_M91 = fail ->
		1:(s_Workload' = fail);



	
	[] s_Workload = 4 -> 1:(s_Workload' = success);

	
	
		[] s_Workload = success -> 1:(s_Workload' = success);
	
	
	[] s_Workload = fail -> 1:(s_Workload' = fail);

	endmodule

	