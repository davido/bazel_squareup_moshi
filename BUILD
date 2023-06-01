load("@rules_java//java:defs.bzl", "java_library", "java_plugin")

java_plugin(
    name = "auto-value-plugin",
    processor_class = "com.google.auto.value.processor.AutoValueProcessor",
    deps = [
        "@maven//:com_google_auto_value_auto_value",
    ],
)

java_plugin(
    name = "auto-value-moshi-factory-plugin",
    processor_class = "com.ryanharter.auto.value.moshi.factory.AutoValueMoshiAdapterFactoryProcessor",
    deps = [
        "@maven//:com_ryanharter_auto_value_auto_value_moshi_factory",
    ],
)

java_library(
    name = "auto-value-plugins",
    exported_plugins = [
        ":auto-value-moshi-factory-plugin",
        ":auto-value-plugin",
    ],
    exports = [
        "@maven//:com_google_auto_value_auto_value_annotations",
        "@maven//:com_ryanharter_auto_value_auto_value_moshi_annotations",
    ],
)

java_library(
    name = "entities",
    srcs = [
        "src/main/java/GitUser.java",
        "src/main/java/JsonAdapterFactory.java",
    ],
    deps = [
        ":auto-value-plugins",
        "@maven//:com_squareup_moshi_moshi",
    ],
)
