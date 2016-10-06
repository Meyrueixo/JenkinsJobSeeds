job('Andro-Init') {
  steps {
	  shell('sudo apt-get update')
	  shell('sudo apt-get install -y lib32z1')
	  shell('sudo apt-get install -y gcc-multilib')
	  shell('sudo dpkg --add-architecture i386')
	  shell('sudo apt-get -qqy update')
	  shell('sudo apt-get -qqy install libncurses5:i386 libstdc++6:i386 zlib1g:i386')
	  shell('sudo apt-get install -y libqt5webkit5')
  }
}
