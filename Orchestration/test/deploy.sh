oc config use-context documentsdock-test-apps
oc create configmap app-config --from-file=src/main/resources/config-test/application-dev.yml
oc apply -f Orchestration/test/deployment.yaml
oc apply -f Orchestration/test/service.yaml