job('Andro-Init') {
  steps {
      shell('sudo apt-get update')
	  shell('sudo apt-get install -y lib32z1')
	  shell('sudo apt-get install -y gcc-multilib')
  }
}