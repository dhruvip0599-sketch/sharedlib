def call() {

  def mavenCommand = "mvn package -DskipTests=true"

  sh script: mavenCommand, returnstatus:true

  


}
