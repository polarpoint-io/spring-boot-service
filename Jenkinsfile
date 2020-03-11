import io.polarpoint.workflow.*

@Library('pipeline-library@master') _


import io.polarpoint.workflow.*

/* use the global workflow library



properties([
        buildDiscarder(logRotator(artifactDaysToKeepStr: '30', artifactNumToKeepStr: '10', daysToKeepStr: '30', numToKeepStr: '10')),
        [$class: 'RebuildSettings', autoRebuild: true, rebuildDisabled: false]
])
*/

def configuration = "pipelines/conf/configuration.json"
invokeJava_v_0_2_0_Pipeline('spring-boot-service', configuration)

