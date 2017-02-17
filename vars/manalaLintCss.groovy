def call(String version = 'latest', Closure body) {
  script {
    docker.image("manala/lint-css:${version}").inside {
      body()
    }
  }
}
