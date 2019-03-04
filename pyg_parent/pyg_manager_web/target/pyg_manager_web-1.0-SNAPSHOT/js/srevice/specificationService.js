app.service('specificationService', function ($http) {
    //把内置服务发送请求的代码全部都抽取到当前文件中
    //查询
    this.findAll = function () {
        return $http.get('../specification/findAll.do');
    }

    //分页的
    this.findPage = function (itemsPerPage, currentPage) {
        return $http.get('../specification/findPage.do?page='+currentPage+'&rows='+itemsPerPage);
    }

    //添加
    this.add = function (entity) {
        //alert(2222)
        return $http.post('../specification/add.do', entity)
    }

    //修改
    this.update = function (entity) {
        return $http.post('../specification/update.do', entity);
    }

    //回显
    this.findOne = function (id) {
        return $http.get('../specification/findOne.do?id='+id);
    }

    //删除
    this.delete = function (selectIds) {
        return $http.get('../specification/delete.do?ids='+selectIds);
    }

    //模糊查询
    this.search = function (currentPage, itemsPerPage, searchEntity) {
        return $http.post('../specification/search.do?page='+currentPage+'&rows='+itemsPerPage, searchEntity);
    }

    //规格的关联
    this.findBySpecList = function () {
        return $http.get('../specification/findBySpecList.do')
    }
})