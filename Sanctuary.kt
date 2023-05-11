fun main() {
  // mutable declarations
  var responsibilities = listOf(
    "feed the chimps", "play a random game", "conduct a health check on Foxie")
  var responsibilitiesComplete = 0
  var timeSpent = 0

  // immutable declarations
  val totalShiftTime = 4

  // map collections
  val foxiesHealthCheck = mutableMapOf<String, Any?>()
  val chimpsHaveEaten = mutableMapOf("Bonnie" to false, "Jubilee" to false, "Frodo" to false, "Foxie" to false)

  // first task - feeding chimps
  println("First, ${responsibilities[0]}")
  println("Feeding Bonnie....")
  chimpsHaveEaten["Bonnie"] = true

  println("Feeding Jubilee....")
  chimpsHaveEaten["Jubilee"] = true

  println("Feeding Frodo....")
  chimpsHaveEaten["Frodo"] = true

  println("Feeding Foxie....")
  chimpsHaveEaten["Foxie"] = true

  // task completed
  timeSpent++
  responsibilitiesComplete++
  println("All chimps have now been fed! You've completed $responsibilitiesComplete / ${responsibilities.size}")

  // adding line breaks
  println(" ")
  println(" ")

  // Second task - play a random game
  println("Next, ${responsibilities[1]}")

  val games = mutableSetOf("tug-of-war with a blanket", "catch and throw", "number game")
  val randomGame = games.random()
  println(randomGame)

  // task 2 completed
  timeSpent++
  responsibilitiesComplete++
  println("Each chimp has now played a game of $randomGame! You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

  // adding line breaks
  println(" ")
  println(" ")

  // third task - conduct a health check on Foxie
  println("Next, ${responsibilities[2]}")
  foxiesHealthCheck.put("temperature", 32.7)
  foxiesHealthCheck.put("mood", "happy")
  println("Foxie has a temperature of ${foxiesHealthCheck["temperature"]} and is feeling ${foxiesHealthCheck["mood"]}")

  // task 2 completed
  timeSpent++
  responsibilitiesComplete++
  println("You've now completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

  // adding line breaks
  println(" ")
  println(" ")

  // checks if responsibilities completed on time
  if (timeSpent <= totalShiftTime) {
    println("Congrats you've completed the responsibilities on time.")
  } else if (timeSpent >= totalShiftTime) {
    println("You're responsibilities were completed but with overtime.")
  } else {
    println("No responsibilities completed.")
  }
}
