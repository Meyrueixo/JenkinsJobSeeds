job('Andro build example') {
  scm {
      github 'pockethub/PocketHub'
  }
  triggers {
      scm 'H/5 * * * *'
  }
  steps {
      gradle 'clean assemble test'
  }
  publishers {
      archiveJunit 'build/test-results/**/*.xml'
      extendedEmail 'email@example.com'
  }
}