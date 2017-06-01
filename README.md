# BioMedAnalysis_REST
Author: Cai Chen (University of Melbourne)
Supervisor: Karin Verspoor (University of Melbourne)

This is the biomedical annotataion and translation service, which has 2 core functions:
1. Identify the biomedical concept.
2. Translate the biomedical entity into another language.

Some other features:
1. Implemented in JAVA.
2. Integration in UIMA framework.
3. Use the MetaMap server.

How to use:
1. Install the MetaMap first. https://metamap.nlm.nih.gov/Docs/README_javaapi.html
2. Start the web service by running the class of com.unimelb.comp90055.bmAnalysis.restService.AnnoServiceStart
3. Send the call http://localhost:9998/annoService/query?text=... &semGroup=…&language=…
   text: the text to be annotated
   semGroup: semantic group used to configure the MetaMap https://metamap.nlm.nih.gov/SemanticTypesAndGroups.shtml
   language: language term ENG,GER,JPN,DUT,FRA...
4. Result is wrapped in JSON
