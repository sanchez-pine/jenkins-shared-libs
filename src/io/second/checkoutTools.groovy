package io.second

def checkOutFrom(repoUrl, brancheName) {
    git branche: brancheName, url: repoUrl
}

return this