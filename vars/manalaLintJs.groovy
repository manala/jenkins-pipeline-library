def call(Closure body) {
  script {
    docker.image('manala/lint-js:0').inside {
      body()
    }
  }
}
