import React from 'react';
import { Link } from 'react-router-dom';
import { motion } from 'framer-motion';
import { Search, UserCheck, CheckCircle2, ArrowRight } from 'lucide-react';

const steps = [
    {
        icon: <UserCheck className="w-8 h-8 text-saffron-500" />,
        title: "1. Tell us about yourself",
        description: "Answer a few simple questions about your demographic and occupation."
    },
    {
        icon: <Search className="w-8 h-8 text-primary-500" />,
        title: "2. AI analyzes schemes",
        description: "Our AI scans hundreds of government welfare programs instantly."
    },
    {
        icon: <CheckCircle2 className="w-8 h-8 text-india-green-500" />,
        title: "3. Get your matched list",
        description: "Discover exactly what your family qualifies for and how to apply."
    }
];

const Home = () => {
    return (
        <div className="flex-1 w-full bg-slate-50 relative overflow-hidden">
            {/* Background Ornaments */}
            <div className="absolute top-0 left-0 w-full h-full overflow-hidden pointer-events-none">
                <div className="absolute top-[-20%] right-[-10%] w-[50%] h-[50%] bg-primary-200/40 rounded-full blur-[100px]" />
                <div className="absolute bottom-[-20%] left-[-10%] w-[50%] h-[50%] bg-saffron-500/10 rounded-full blur-[120px]" />
            </div>

            <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 relative z-10 pt-32 pb-20">

                {/* Hero Section */}
                <div className="text-center max-w-4xl mx-auto mb-20">
                    <motion.div
                        initial={{ opacity: 0, y: 20 }}
                        animate={{ opacity: 1, y: 0 }}
                        transition={{ duration: 0.6 }}
                    >
                        <span className="inline-block py-1 px-3 rounded-full bg-primary-100 text-primary-700 text-sm font-semibold mb-6 shadow-sm border border-primary-200">
                            Government Welfare Discovery made simple
                        </span>
                    </motion.div>

                    <motion.h1
                        initial={{ opacity: 0, y: 20 }}
                        animate={{ opacity: 1, y: 0 }}
                        transition={{ duration: 0.6, delay: 0.1 }}
                        className="text-5xl md:text-6xl font-extrabold text-slate-900 tracking-tight leading-tight mb-6"
                    >
                        Discover Government Schemes <br className="hidden md:block" />
                        <span className="text-gradient">You Actually Qualify For.</span>
                    </motion.h1>

                    <motion.p
                        initial={{ opacity: 0, y: 20 }}
                        animate={{ opacity: 1, y: 0 }}
                        transition={{ duration: 0.6, delay: 0.2 }}
                        className="text-xl text-slate-600 mb-10 max-w-2xl mx-auto leading-relaxed"
                    >
                        Answer a few simple questions and let our AI find the right welfare programs for your family. No jargon, just clear benefits.
                    </motion.p>

                    <motion.div
                        initial={{ opacity: 0, y: 20 }}
                        animate={{ opacity: 1, y: 0 }}
                        transition={{ duration: 0.6, delay: 0.3 }}
                        className="flex flex-col sm:flex-row justify-center gap-4"
                    >
                        <Link
                            to="/form"
                            className="group flex items-center justify-center gap-2 bg-primary-600 hover:bg-primary-700 text-white px-8 py-4 rounded-full text-lg font-bold transition-all shadow-xl shadow-primary-500/30 hover:shadow-2xl hover:shadow-primary-500/40 hover:-translate-y-1"
                        >
                            <span>Build My Persona</span>
                            <ArrowRight className="group-hover:translate-x-1 transition-transform" />
                        </Link>
                    </motion.div>
                </div>

                {/* How it Works Section */}
                <motion.div
                    initial={{ opacity: 0, y: 40 }}
                    whileInView={{ opacity: 1, y: 0 }}
                    viewport={{ once: true, margin: "-100px" }}
                    transition={{ duration: 0.7 }}
                    className="mt-24 pt-16 border-t border-slate-200/60"
                >
                    <div className="text-center mb-12">
                        <h2 className="text-3xl font-bold text-slate-900 mb-4">How it Works</h2>
                        <p className="text-slate-500">Find your eligible schemes in three simple steps</p>
                    </div>

                    <div className="grid md:grid-cols-3 gap-8">
                        {steps.map((step, index) => (
                            <motion.div
                                key={index}
                                whileHover={{ y: -5 }}
                                className="glass-card p-8 rounded-2xl relative overflow-hidden group"
                            >
                                <div className="absolute top-0 right-0 w-32 h-32 bg-slate-100 rounded-full mix-blend-multiply filter blur-2xl opacity-50 group-hover:opacity-100 transition-opacity"></div>
                                <div className="mb-6 inline-flex items-center justify-center w-16 h-16 rounded-xl bg-slate-50 shadow-sm border border-slate-100">
                                    {step.icon}
                                </div>
                                <h3 className="text-xl font-bold text-slate-900 mb-3">{step.title}</h3>
                                <p className="text-slate-600 leading-relaxed">{step.description}</p>
                            </motion.div>
                        ))}
                    </div>
                </motion.div>

            </div>
        </div>
    );
};

export default Home;
