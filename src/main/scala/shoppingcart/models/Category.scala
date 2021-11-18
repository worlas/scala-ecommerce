package shoppingcart.models

case class Category(id : Int, name : String, description : String)

object Category {
  private var categoryList : Map[Int, Category] = Map()
  private var productList : List[Product] = List()

  // add new category
  def add(category: Category) : Unit = { categoryList += category.id -> category }

  // get single category
  def view(categoryId : Int) : Category = { categoryList.getOrElse(categoryId, throw new RuntimeException) }

  // get all categories
  def index() : Unit = { for(k, v) <- categoryList do println(List(v))}

  // remove from category
  def delete() : Unit = {}

  // get all products under specified category
  def showProducts() : Unit = {}
}