Sample application storing data in GCP Datastore.
Based on https://www.youtube.com/watch?v=bpKrcmSgdmk

In order to run it the GCP project needs to be created together with the Datastore.

The credentials can be passed e.g. as environment properties:

```
-Dspring.cloud.gcp.project-id=[PROJECT_ID] 
-Dspring.cloud.gcp.credentials.location=file:[PATH_TO_CREDENTIALS]
```