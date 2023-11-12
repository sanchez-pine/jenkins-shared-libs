package io.example

class Example implements Serializable {
    def env
    def steps

    ExampleTools(env, steps){
        this.env = env
        this.steps = steps
    }

    def printEnv(){
        steps.echo "< Builda ${env.BUILD_ID} on ${env.JOB_NAME} >"
    }
}