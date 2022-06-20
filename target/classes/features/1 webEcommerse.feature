Feature: Customer login web E-commerse
	Scenario: Testing 
		Given Customer mengakses url
		When Customer login dengan email dan password
		Then Customer berhasil login
		When Customer menambahkan produk jenis women ke cart 
		Then Customer berhasil menambahkan produk jenis women ke cart
		And Customer menambahkan produk jenis dress ke cart 
		Then Customer berhasil menambahkan produk jenis dress ke cart
		And Customer menambahkan produk jenis Tshirts ke cart 
		Then Customer berhasil menambahkan produk jenis Tshirts ke cart
		And Customer melakukan proses checkout
		Then Costumer berhasil checkout