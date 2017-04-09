def call(String version = 'latest', Closure body) {
  script {
    docker.image("manala/lint-php:${version}").inside {
      body()
    }
  }
}
