def call(String version = 'latest', Closure body) {
  script {
    docker.image("manala/security-php:${version}").inside('--entrypoint=') {
      body()
    }
  }
}
