Simple Salesforce SOAP Server
=====================================

I often find myself wanting to test Saleforce's Web Service function but have problems finding a good sample SOAP service to test with. Frequently the WSDL2Apex parser complains and is not able to create the Apex classes for the endpoint. Therefore I built my own that you can modify to suit your needs.

Warning: this is a very simple server and most of the functionality is mocked.

I am currently unable to get Java to generate the WSDL file automatically with the endpoint address so I [added it my self](https://github.com/jeffdonthemic/simple-salesforce-soap-server/blob/master/public/calculator.xml#L174) and made it publicly available.
