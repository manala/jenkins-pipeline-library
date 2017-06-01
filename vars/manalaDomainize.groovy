def call(String input) {
  input = input.trim().toLowerCase()
  input = input.replace(" ", "-").replace("_", "-")
  input = input.split("/").reverse().join(".")
  return input
}
