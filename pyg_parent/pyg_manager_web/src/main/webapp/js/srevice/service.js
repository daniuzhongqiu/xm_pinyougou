app.service('brandService', function ($http) {
    //把内置服务发送请求的代码全部都抽取到当前文件中
    //查询
    this.findAll = function () {
        return $http.get('../brand/findAll.do');
    }

    //分页的
    this.findPage = function (itemsPerPage, currentPage) {
        return $http.get('../brand/findPage.do?pageSize='+itemsPerPage+'&pageNo='+currentPage);
    }

    //添加
    this.add = function (entity) {
        return $http.post('../brand/add.do', entity)
    }

    //修改
    this.update = function (entity) {
        return $http.post('../brand/update.do', entity);
    }

    //回显
    this.findOne = function (id) {
        return $http.get('../brand/findOne.do?id='+id);
    }

    //删除
    this.delete = function (selectIds) {
        return $http.get('../brand/delete.do?ids='+selectIds);
    }

    //模糊查询
    this.search = function (currentPage, itemsPerPage, searchEntity) {
        return $http.post('../brand/search.do?page='+currentPage+'&rows='+itemsPerPage, searchEntity);
    }

    //关联商品
    this.findByList = function () {
        return $http.get('../brand/findByList.do')
    }
})