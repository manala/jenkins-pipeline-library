def call(String version = 'latest', Closure body) {
  script {
    docker.image("manala/lint-js:${version}").inside {
      body()
    }
  }
}
