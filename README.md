gradle-github-plugin
====================

You can fully automate releases via *gradle-github-plugin*. :rocket:


## Supported features

- Create a release
- Upload your files!!!


## Installation

Currently, It's not supported in any repositores.
So you should use `mavenLocal()`.

```sh
git clone https://github.com/riiid/gradle-github-plugin
cd gradle-github-plugin
./gradlew install
```


## Usage

Edit your `build.gradle` file with the following:

```groovy
buildscript {
    repositories {
        mavenLocal()
    }

    dependencies {
        ...
        classpath 'co.riiid:gradle-github-plugin:0.1.0'
        ...
    }
}
```

Then add `github` configuration and set properties.

### Supported Properties

Name | Type | Description
--- | --- | ---
owner | String | *Required.* The id of your Github.
repo | String | *Required.* The name of your Github's repository.
token | String | *Required.* Github access token. Generate yours in [Settings/Applications][settings_apps]
tagName | String | *Required.* The name of the tag.
targetCommitish | String | *Default is master.* Specifies the commitish value that determines where the Git tag is created from. Can be any branch or commit SHA. Unused if the Git tag already exists. Default: the repository’s default branch (usually master).
name | String | *Optional.* The name of the release.
body | String | *Optional.* Text describing the contents of the tag.

### Example

```groovy
github {
    owner = 'riiid'
    repo = 'gradle-github-plugin'
    token = 'XXXXXXXXXXXXXXXXXXXXX'
    tagName = '0.1.0'
    targetCommitish = 'master'
    name = 'v0.1.0'
    body = 'first release'
    assets = [
            'app/build/outputs/apk/app-release.apk',
            'app/build/outputs/mapping/release/mapping.txt',
            ...
    ]
}
```


## References

- [Github Releases][github-releases]












[github-releases]: https://developer.github.com/v3/repos/releases/
[settings_apps]: https://github.com/settings/applications