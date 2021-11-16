package shoppingcart.models

case class Category(Id : Int, Name : String, Description : String)

object Category {
  private val categoryList : Map[Int, Category] = Map()
  private val productList : List[Product] = List()

  // add new category
  def add(category: Category) : Unit = {}

  // get single category
  def view(categoryId : Int) : Category = { categoryList.getOrElse(categoryId, throw new RuntimeException) }

  // get all categories
  def index() : Unit = { for(k, v) <- categoryList do println(List(v))}

  // remove from category
  def delete() : Unit = {}

  // get all products under specified category
  def showProducts() : Unit = {}
}