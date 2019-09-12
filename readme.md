
# Contributing

This project welcomes contributions and suggestions.  Most contributions require you to agree to a
Contributor License Agreement (CLA) declaring that you have the right to, and actually do, grant us
the rights to use your contribution. For details, visit https://cla.microsoft.com.

When you submit a pull request, a CLA-bot will automatically determine whether you need to provide
a CLA and decorate the PR appropriately (e.g., label, comment). Simply follow the instructions
provided by the bot. You will only need to do this once across all repos using our CLA.

This project has adopted the [Microsoft Open Source Code of Conduct](https://opensource.microsoft.com/codeofconduct/).
For more information see the [Code of Conduct FAQ](https://opensource.microsoft.com/codeofconduct/faq/) or
contact [opencode@microsoft.com](mailto:opencode@microsoft.com) with any additional questions or comments.


### Autorest plugin configuration
- Please don't edit this section unless you're re-configuring how the powershell extension plugs in to AutoRest
AutoRest needs the below config to pick this up as a plug-in - see https://github.com/Azure/autorest/blob/master/docs/developer/architecture/AutoRest-extension.md


#### Mapper

``` yaml
use-extension:
  "@microsoft.azure/autorest.remodeler": "beta"

pipeline:

# --- extension remodeler ---

  # "Shake the tree", and normalize the model
  remodeler:
    input: openapi-document/multi-api/identity     # the plugin where we get inputs from
  
  # allow developer to do transformations on the code model. 
  remodeler/new-transform: 
    input: remodeler 

  # Make some interpretations about what some things in the model mean
  tweakcodemodel:
    input: remodeler/new-transform

  mapper:
    input: tweakcodemodel      # the plugin where we get inputs from
    output-artifact: java-files
    
  mapper/emitter:
    input: mapper
    scope: scope-mapper/emitter

scope-mapper/emitter:
    input-artifact: java-files
    output-uri-expr: $key
  
output-artifact: java-files
```