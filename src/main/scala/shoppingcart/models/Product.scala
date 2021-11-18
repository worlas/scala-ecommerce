package shoppingcart.models

import java.util.Date

case class Product(id: Int, name: String, brand: String, price: Double, expiry: Date)

object Product {
  private val productList : List[Product] = List();
  
  // add new product to list
  def add(product: Product) = {}
  
  // view single product details 
  
  // remove single product by Id
  
  // delete all products 
}


