def call(Map config = [:]) {
    sh "MY HELLO WORLD!!!! ${config.name}. Today is ${config.dayOfWeek}."
}