# spring-cloud-sample

Eureka UI - http://localhost:8761/
Product-service - GET:http://localhost:8001/inventories/find-by-productids?product-id=0&poduct-id=10
Order-service - POST : http://localhost:8002/orders/
	sample JSON : [{"productId": 1001, "productName" : "Product 1"}]
	
	GET : http://localhost:8002/orders/order-id/e3aef271-dd9b-44c6-923f-a1507078199a
	GET : http://localhost:8002/orders/sub-order-id/dc074524-67e0-43a5-9ca5-8ae5d1598585
