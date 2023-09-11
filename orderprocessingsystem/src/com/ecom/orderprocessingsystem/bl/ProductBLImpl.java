package com.ecom.orderprocessingsystem.bl;

import java.util.HashSet;

import com.ecom.orderprocessingsystem.dao.ProductDao;
import com.ecom.orderprocessingsystem.dao.ProductDaoImpl;
import com.ecom.orderprocessingsystem.dao.ProductImportStatus;
import com.ecom.orderprocessingsystem.models.Product;

public class ProductBLImpl implements ProductBL{

	ProductDao productDao= new ProductDaoImpl();
	
	@Override
	public ProductImportStatus importProducts(HashSet<Product> products) {
		// TODO Auto-generated method stub
		return productDao.importProducts(products, 0, 0);
	}

}
