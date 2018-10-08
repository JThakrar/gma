
# GMA Project

## Overview
This project is to compute the LACE score for a given measure.
See the links in the reference list below for more info on LACE score/index.

## Pre-requisites
- Apache Spark 2.2.x
- Scala 2.11.x
- SBT

## How To Build, Deploy and Run

Download the project and build as follows.

```
git clone https://github.com/JThakrar/gma.git

cd gma

sbt universal:packageBin
```


Unpack the packaged artifact


```
cd target/universal

unzip gma-1.0.zip
```


Run the Spark application program

```
gma-1.0/bin/compute_measure AMI

gma-1.0/bin/compute_measure COPD

gma-1.0/bin/compute_measure HF

gma-1.0/bin/compute_measure HWR

gma-1.0/bin/compute_measure PN

gma-1.0/bin/compute_measure THA-TKA
```


## References

[Simple Introduction to LACE](https://www.besler.com/lace-risk-score/)

[Hospital Score and LACE Index](https://www.ncbi.nlm.nih.gov/pmc/articles/PMC5374974/)