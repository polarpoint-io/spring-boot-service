import io.polarpoint.workflow.*

@Library('pipeline-library@master')


import io.polarpoint.workflow.*

/* use the global workflow library

*/

properties([
        buildDiscarder(logRotator(artifactDaysToKeepStr: '30', artifactNumToKeepStr: '10', daysToKeepStr: '30', numToKeepStr: '10')),
        [$class: 'RebuildSettings', autoRebuild: true, rebuildDisabled: false]
])


def configuration = "pipelines/conf/configuration.json"
invokePipeline('spring-boot-service', configuration)

