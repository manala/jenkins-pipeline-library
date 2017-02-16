def call(Integer version = 0, Closure body) {
  script {
    docker.image("manala/lint-js:${version}").inside {
      body()
    }
  }
}
