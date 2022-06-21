Feature: Customer add product to cart
	Scenario: Testing add to cart
		When Customer menambahkan produk jenis women ke cart 
		Then Customer berhasil menambahkan produk jenis women ke cart
		And Customer menambahkan produk jenis dress ke cart 
		Then Customer berhasil menambahkan produk jenis dress ke cart
		And Customer menambahkan produk jenis Tshirts ke cart 
		Then Customer berhasil menambahkan produk jenis Tshirts ke cart