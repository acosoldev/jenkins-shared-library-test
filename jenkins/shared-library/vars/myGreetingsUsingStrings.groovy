def call(String name, String dayOfWeek) {
    sh "echo Hola ${name}. Today is a great day: ${dayOfWeek}"
}