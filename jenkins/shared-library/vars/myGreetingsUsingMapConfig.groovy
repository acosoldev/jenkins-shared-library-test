def call(Map config = [:]) {

    // WE SHOULD VALIDATE THE ENTRY!!! check if they are null, are strings, are valid dates, etc   
    sh "echo Hola ${config.name}. ${config.dayOfWeek} is a great day: "
}