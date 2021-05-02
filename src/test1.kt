fun main(): Unit {
    val r11 = Recipe2("Chicken Soup")
    val r22 = Recipe2("Quinoa Salad")
    val r33 = Recipe2("Thai Curry")
    val recipeMap2 = mapOf("Recipe1" to r11, "Recipe2" to r22, "Recipe3" to r33)

    if (recipeMap2.containsKey("Recipe1")) {
        val recipe = recipeMap2.getValue("Recipe1")
        //Код использования объекта Recipe
    }
}


data class Recipe2(val name:String = "")
