class PrintDump {
    companion object {
        fun print(obj: Any) {
            val className = obj::class.simpleName
            println("$className {")
            obj::class.memberProperties.forEach { prop ->
                val value = prop.getter.call(obj)
                println("  ${prop.name}: $value")
            }
            println("}")
        }
    }
}
