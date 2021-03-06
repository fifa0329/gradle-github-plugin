package co.riiid.gradle

class GithubExtension {

    String owner
    String repo
    String token

    String tagName
    String targetCommitish = "master"
    String name
    String body

    String[] assets

    String getOwner() {
        return owner
    }

    String getRepo() {
        return repo
    }

    String getToken() {
        return token
    }

    String getTagName() {
        return tagName
    }

    String getTargetCommitish() {
        return targetCommitish
    }

    String getName() {
        return name
    }

    String getBody() {
        return body
    }

    String[] getAssets() {
        return assets
    }

    void setOwner(String owner) {
        if (owner == null || owner.isEmpty()) {
            throw new IllegalArgumentException("owner")
        }

        this.owner = owner
    }

    void setRepo(String repo) {
        if (repo == null || repo.isEmpty()) {
            throw new IllegalArgumentException("repo")
        }

        this.repo = repo
    }

    void setToken(String token) {
        if (token == null || token.isEmpty()) {
            throw new IllegalArgumentException("token")
        }

        this.token = token
    }

    void setTagName(String tagName) {
        this.tagName = tagName
    }

    void setTargetCommitish(String targetCommitish) {
        this.targetCommitish = targetCommitish
    }

    void setName(String name) {
        this.name = name
    }

    void setBody(String body) {
        this.body = body
    }

    void setAssets(String[] assets) {
        this.assets = assets
    }
}
