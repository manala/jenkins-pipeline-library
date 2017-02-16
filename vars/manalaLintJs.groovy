def call(Integer version = 0, Closure body) {
  script {
    docker.image("manala/lint-js:${versiob}").inside {
      body()
    }
  }
}
