def call(String input) {
  input = input.trim().toLowerCase()
  input = input.replace("https://", "").replace(".git", "")
  return input
}
