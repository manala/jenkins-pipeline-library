def call(String input) {
  input = input.trim().toLowerCase()
  input = input.replace(" ", "-").replace("_", "-")
  return input
}
