job('Andro build example') {
  scm {
      github 'pockethub/PocketHub'
  }
  triggers {
      scm 'H/5 * * * *'
  }
  steps {
      gradle 'clean build testDebugUnitTest testReleaseUnitTest'
  }
  publishers {
      archiveJunit 'build/test-results/**/*.xml'
      extendedEmail 'email@example.com'
  }
}
