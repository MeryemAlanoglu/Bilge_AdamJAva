INSERT INTO public.tbl_customer_orders(
	 customer_name, customer_email, order_id, order_date, order_total_amount)
	VALUES ('alperen','alperen@gmail.com ' , 3 ,12343242534534, 23234.234);
	
	SELECT * FROM tbl_customer_orders;
	
	INSERT INTO public.tbl_customer(
	customer_name, customer_email)
	VALUES ('muhammet', 'muhammetgmail.com');
	
	SELECT * FROM tbl_customer;
	
	INSERT INTO public.tbl_orders(
	 order_date,order_total_amount,customer_id)
	VALUES (123454645,175873.65,3);
	
	SELECT * FROM tbl_orders;
	
	
	
	