job('Andro test example') {
  wrappers {
    androidEmulator {
      avdName(null)
      osVersion('4.1')
      screenDensity('240')
      screenResolution('WVGA')
      deviceLocale('fr_FR')
      sdCardSize(null)
      wipeData(false)
      showWindow(false)
      useSnapshots(false)
      deleteAfterBuild(false)
      startupDelay(0)
      startupTimeout(0)
      commandLineOptions('-no-audio -gpu off')
      targetAbi('armeabi-v7a')
      executable('emulator64-arm')
      avdNameSuffix(null)
    }
  }
  steps {
    updateProjectBuilder()
    installBuilder {
      apkFile('foo.apk')
      uninstallFirst(true)
      failOnInstallFailure(true)
    }
    projectPrerequisitesInstaller()
    monkeyBuilder {
      filename(null)
      packageId(null)
      eventCount(200)
      throttleMs(0)
      seed('0')
      categories(null)
      extraParameters(null)
    }    
    uninstallBuilder {
      packageId('foo.apk')
      failOnUninstallFailure(false)
    }
  }
  publishers {
    monkeyRecorder {
      filename(null)
      failureOutcome('UNSTABLE')
    }
  }
}