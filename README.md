UnitDummy
=========

A dummy plugin of information unit for the framework of evaluating information completeness of event logs.

An information unit is used to measure the degree of information
completeness of an event log. Each approach to the log completeness problem
must depend on a definition of information unit. And the definition of information unit may vary
across estimators (the implementations of such approaches). The most intuitive information unit
for the global completeness evaluation of an event log is 'trace'.
See http://bpmcenter.org/wp-content/uploads/reports/2012/BPM-12-04.pdf
for more information about the log completeness problem and the definition
of information unit. 
	
Some pre-defined information units have been implemented in the framework CompletenessFramework, 
which is proposed to evaluate log completeness. See https://github.com/hunter99/CompletenessFramework 
for more details on the framework.

If an information unit implements the Java interface 'howmuch.parse.StatRes' required by the framework mentioned above, 
it can be deployed conveniently as a plugin of the framework by means of
simply putting the unit jar file(s) into the directory
'./lib/plugins/units/' of the framework. 

This project implements a dummy unit as an example.
