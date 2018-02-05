def call(String version = 'latest', Closure body) {
  script {
    docker.image("manala/test-js:${version}").inside('--entrypoint=') {
      body()
    }
  }
}
