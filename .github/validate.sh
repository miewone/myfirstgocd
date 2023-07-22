for SERVICE in $(ls values); do
    helm template -f ${SERVICE} using_helm/gocd-pipeline \
        > pipelines/${SERVICE}.gocd.yaml
done