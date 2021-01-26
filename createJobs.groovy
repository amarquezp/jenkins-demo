pipelineJob('theme-park-ride') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/amarquezp/spring-boot-jenkins.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}