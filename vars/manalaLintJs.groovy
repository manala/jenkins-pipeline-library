def call(String name = 'rien', Closure body) {
  echo "Hellooooooooooooooooooooo, ${name}."
  script {
    docker.image('manala/lint-js:0').inside {
      body()
    }
  }
}
