new Vue({
    el: "#app",
    data: {
        //表格数据
        tableData: [],
        TableData2: [],
        // //    当前页
        // currentPage: 1,
        // //    一共多少条数据
        // total: 0,
        // //    每页显示多少条
        // pageSize: 5,
        loading: true,
        activeName: 'first'
    },
    methods: {
        // delStu(sid) {
        //
        //     var _this = this;
        //
        //     this.$confirm('此操作将永久删除该记录, 是否继续?', '提示', {
        //         confirmButtonText: '确定',
        //         cancelButtonText: '取消',
        //         type: 'warning'
        //     }).then(() => {
        //         axios.get('delBySid', {
        //             params: {
        //                 'sid': sid
        //             }
        //         })
        //             .then(function (response) {
        //
        //                 _this.loadTableData();
        //
        //                 _this.$message({
        //                     type: 'success',
        //                     duration: 800,
        //                     message: '删除成功!'
        //                 });
        //
        //
        //             })
        //             .catch(function (error) {
        //                 _this.$message({
        //                     type: 'info',
        //                     duration: 800,
        //                     message: '已取消删除'
        //                 });
        //             })
        //             .then(function () {
        //                 _this.loading = false;
        //             });
        //
        //
        //     }).catch(() => {
        //         this.$message({
        //             type: 'info',
        //             duration: 800,
        //             message: '已取消删除'
        //         });
        //     });
        // },
        // handleSizeChange(val) {
        //     this.pageSize = val;
        //     this.loadTableData();
        // },
        // handleCurrentChange(val) {
        //     this.currentPage = val;
        //     this.loadTableData();
        // },

        //加载表格数据
        loadTableData() {
            var _this = this;
            var start = (this.currentPage - 1) * this.pageSize;

            axios.get('transactor/selectAll', {
                params: {
                    'pageSize': _this.pageSize,
                    'start': start
                }
            })
                .then(function (response) {
                    _this.tableData = response.data;
                    console.log(response.data)
                    _this.total = response.data.total;

                })
                .catch(function (error) {
                    console.log(error);
                })
                .then(function () {
                    _this.loading = false;
                });
        },

        // ===========================================================

        //加载表格数据
        loadTableData2() {
            var _this = this;
            var start = (this.currentPage - 1) * this.pageSize;
            axios.get('transactor/selectByTcheck', {
                params: {
                    'pageSize': _this.pageSize,
                    'start': start
                }
            })
                .then(function (response) {

                    _this.TableData2 = response.data;

                })
                .catch(function (error) {
                    console.log(error);
                })
                .then(function () {
                    _this.loading = false;
                });
        },

        handleClick(tab, event) {
            if (tab.name == "first"){
                 this.loadTableData()
            }else {
                this.loadTableData2()
            }
        }

    },
    //vue初始化完毕调用
    created() {
        this.loadTableData();
    }



    /*

    对象  集合    基本类型



     */


})


